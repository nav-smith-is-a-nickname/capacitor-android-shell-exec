import { registerPlugin } from '@capacitor/core';

import type { ShellExecPlugin } from './definitions';

/**
 * @const ShellExecPlugin
 * @description Android-only commandline execution plugin for Capacitor.
 */
export const ShellExec = registerPlugin<ShellExecPlugin>('ShellExec');

export * from './definitions';