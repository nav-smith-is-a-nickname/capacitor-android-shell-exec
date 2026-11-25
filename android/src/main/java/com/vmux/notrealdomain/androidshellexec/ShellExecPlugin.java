package com.vmux.notrealdomain.androidshellexec;

import com.getcapacitor.JSObject;
import com.getcapacitor.JSArray;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

@CapacitorPlugin(name = "ShellExec")
public class ShellExecPlugin extends Plugin {

    private ShellExec implementation = new ShellExec();

    @PluginMethod
    public void exec(PluginCall call) 
    {
        JSArray value = call.getArray("cmd");
        String[] args = new String[value.length()];
        try 
        {
            for (int i = 0; i < value.length(); o++)
                args[i] = value.getString(i);
        } catch (Exception e) 
        {
            call.reject("Invalid arguments", e);
        }

        RetVal r = implementation.exec(value, call.getBoolean("wait", false));
        
        JSObject ret = new JSObject();
        ret.put("value", r.output);
        ret.put("code", r.code);
        call.resolve(ret);
    }
}
