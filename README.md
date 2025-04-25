# Simple Hello World
A simple "Hello World" program in Java. This simple 200-line program (spanning 11 classes and 2 interfaces) provides a neat and expandable framework for printing `Hello World!` to the console.

## 📈 Advantages

* 🛠️ **Excellent design patterns:** Leverages builder, factory, and provider design patterns used by FAANG and other Fortune 500 companies.
* 📦 **Modular:** Features generalized abstract classes and interfaces such as *Provider* and *Builder* to ensure maximum readability.
* 🧽 **Squeaky-clean code:** Consistent, readable, and absolutely essential formatting.
* 🪤 **Extendable:** Successfully avoids the common mistake by novice programmers of writing a rigid, monolithic Hello World.
* 🔥 **Blazingly fast:** Runs faster than I can time it with my stopwatch.

## 🏗️ Project Structure

Simple, lightweight [Main class](src/main/java/Main.java) with fewer than 25 lines of code! 🪶

### 🔤 [Text Package](src/main/java/text)

Provides a customizable wrapper around `String` for use by the `Printer` (described below).

To obtain a `String`, use a [`TextProvider`](src/main/java/text/TextProvider.java), built via [`TextProviderBuilder`](src/main/java/text/TextProviderBuilder.java). Text provider utilizes a [`Text`](src/main/java/text/Text.java) object. For enhanced modularity, you may also create a [`HelloWorldText`](src/main/java/text/HelloWorldText.java) through the [`TextFactory`](src/main/java/text/TextFactory.java).


### 📦 [Print Package](src/main/java/print)

Handles all print-related operations. Fully modular, supporting customizable print streams and text sources.

To create a [`Printer`](src/main/java/print/Printer.java), use the [`PrinterBuilderFactorySingleton`](src/main/java/print/PrinterBuilderFactorySingleton.java)—your one-stop shop for printer construction.
