# Sprint 1 Task S1.06

## Repository with level-1, level-2 and level-3 exercises from the Java programming course, developed using IntelliJ IDEA and Maven.

### 📂 Repository Contents

| Level   | Exercise | Package            | Principal Classes            | Description                                                                                             |
|---------|---|--------------------|------------------------------|---------------------------------------------------------------------------------------------------------|
| Level 1 | 1 | `level1.exercise1` | `NoGenericMethods`           | Create a non Generic Class to save three arguments of the same type.                                    |
| Level 1 | 2 | `level1.exercise2` | `GenericMethods`, `Person`   | Create a Generic Class with a printElement method to accept three arguments generic type.               |
| Level 2 | 3 | `level2.exercise1` | `GenericMethods`, `Person`   | Modified the previous exercise and merge generic argument types with fixedString.                       |
| Level 2 | 1 | `level2.exercise2` | `GenericMethods`, `Person`   | Modified the previous exercise to put `varargs` with a fixedString with a new method called `printAll`. |
| Level 3 | 1 | `level3.exercise1` | `GenericUtils`, `Smartphone` | Combined advanced generics with interfaces.                                                             | 


## ⚙️ Requirements

- Java JDK 11 o superior
- Maven
- IntelliJ IDEA (optional, but recommended)

---

## 💻 Installation and Execution

1. Clone the repository:

````bash
git clone https://github.com/erictc95/TascaS1.06.git
````

2. Open the project in IntelliJ IDEA or compile with Maven:

````bash
cd TascaS1.06
mvn compile
````

3. Run a specific exercise with Maven:

````bash
mvn exec:java -Dexec.mainClass="package.Main"
````

4. Replace package.Main with the main class of each exercise:

Level-1 / Exercise 1: level1.exercise1

Level-1 / Exercise 2: level1.exercise2

Level-2 / Exercise 1: level1.exercise3

Level-2 / Exercise 2: level1.exercise4

Level-3 / Exercise 1: level1.exercise5



You can also open each Main.java class in IntelliJ and run it directly from the IDE.

## 📝 Usage

Each level folder contains independent exercises.
The exercises demonstrate Java concepts such as different uses of `getElement()`, `printElements()`, `varargs`, `GenericMethods`, `GenericUtils` and `bounded types`.


## 🤝 Contributions

If you want to improve the exercises or add examples:

Fork the repository

Create a branch for your changes: git checkout -b my-branch

Commit your changes: git commit -m "My contribution"

Push your branch: git push origin my-branch

Open a Pull Request

## 📜 License

MIT License

## 👤 Author

Eric Tarres Cabrisas - GitHub --> erictc95