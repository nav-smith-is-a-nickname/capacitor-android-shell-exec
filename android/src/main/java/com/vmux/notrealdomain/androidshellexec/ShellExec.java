package com.vmux.notrealdomain.androidshellexec;

import java.io.InputStream;
import java.io.OutputStream;

public class RetVal
{
    public String output;
    public byte code;

    public RetVal(String output, byte code)
    {
        this.output = output;
        this.code = code;
    }
}

public class ShellExec 
{
    public RetVal exec(String[] input, boolean wait) 
    {
        Process process = (new ProcessBuilder(input)).start();
        if(!wait)
        {
            return new RetVal(new String(), -1);
        }
        p.waitFor();

        byte code = p.exitValue();
        InputStream e = (code > 0) ? p.errorStream() : p.inputStream();
        byte[] o = new byte[e.available()];
        e.read(o, 0, e.available());
        RetVal r = new RetVal(new String(o), code);

        return r;
    }
}
