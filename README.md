## Knowledge to Expert Java

- ### POO
  - [] Object Oriented Programming
  - [] Classes
  - [] Objects
- ### heritage
  - [] Object extends another
  - [] Constructor, super
  - [] Encapsulation
- ### POJO
  - [] pattern classes
  - [] all tributes privated or protected
  - [] only methods setters and getters.
- ### Abstract classes
  - [] classes that we cannot generate objects.
  - [] classes we only have to heritage
- ## Interfaces
  - [] contract defines which methods will works.
  - [] abstract classes have to implement methods.
- ### Polimorfism
  - [] structure that change methods
  - [] LSP (liscove substituiton principle)
  - [] extends and implements. 
  ```java
    // LST, give us methods with differents objects to do a task.
    public void transfer(IBalance obj, double value) {
        this.withdraw(value);
        obj.deposit(value);
    }
  ```

We just can have one "class public" in one archive, cause this each class has to be in separateds archives.