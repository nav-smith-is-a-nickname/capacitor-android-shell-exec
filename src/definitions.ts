/**
 * @interface ShellExecPlugin
 * @description Android-only commandline execution plugin for Capacitor.
 */
export interface ShellExecPlugin 
{
	/**
	 * @async @function exec(options);
	 * @description Executes command-line code.
	 * @param options - Options for execution. Options are written as a dictionary with parameters:
	 *  `cmd` as a list of arguments, including executable.
	 *  `wait` as a boolean meaning if the process should wait until end.
	 * @returns Dictionary with output as `value` and `code` as exit code.
	 */
	exec(options: { cmd: string[], wait: boolean }): Promise<{ value: string, code: number }>;
};