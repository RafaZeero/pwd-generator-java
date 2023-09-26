# Password Generator

A simple password generator that allows you to generate your own unique password.

## Run

To generate your password you can use the command:

```bash
javac PasswordGenerator.java
```

Then after it compiles:

```bash
java PasswordGenerator
```

The default password will be created with `length=12` and no numeric digits or special characters. You can provide the following arguments to change that:

- To change the length: (from 0 to 36)

```bash
java PasswordGenerator --length=25
```

- To add digits:

```bash
java PasswordGenerator --useDigits
```

- To add special characters:

```bash
java PasswordGenerator --useSpecial
```

- With all three, you could do:

```bash
java PasswordGenerator --useSpecial --useDigits --length=25
```

## 😄Autor 
<table>
  <tr>
    <td align="center">
      <a href="https://www.linkedin.com/in/rafael99ldm/">
        <img src="https://github.com/RafaZeero.png" width="100px;" alt="Foto de Rafael Lima do GitHub"/><br>
        <sub>
          <b>Rafael Lima</b>
        </sub>
      </a>
    </td>
  </tr>
</table>
