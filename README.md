# capacitor-android-shell-exec

Executes shell commands on Android.

## Install

To use npm

```bash
npm install capacitor-android-shell-exec
````

To use yarn

```bash
yarn add capacitor-android-shell-exec
```

Sync native files

```bash
npx cap sync
```

## API

<docgen-index>

* [`exec(...)`](#exec)

</docgen-index>

<docgen-api>
<!--Update the source file JSDoc comments and rerun docgen to update the docs below-->

### exec(...)

```typescript
exec(options: { cmd: string[]; wait: boolean; }) => Promise<{ value: string; code: number; }>
```

| Param         | Type                                           | Description                                                                                                                                                                                         |
| ------------- | ---------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| **`options`** | <code>{ cmd: string[]; wait: boolean; }</code> | - Options for execution. Options are written as a dictionary with parameters: `cmd` as a list of arguments, including executable. `wait` as a boolean meaning if the process should wait until end. |

**Returns:** <code>Promise&lt;{ value: string; code: number; }&gt;</code>

--------------------

</docgen-api>
