package oca.inheritance.with_exceptions;

import java.awt.*;

class Foo {}                    // OK
interface Baz {}                // OK
interface Fi {}                // OK
interface Boo extends Fi {}        // OK. An interface can extend an interface
class Zoom implements Fi, Baz {}    //OK. A class can implement multiple interfaces
interface Vroom extends Fi, Baz {}        // OK. An interface can extend multiple interfaces
class Yow extends Foo implements Fi, Baz {}        // OK. A class can do all three (extends must be 1st)
//class Yow extends Foo implements Fi {}        // OK. A class can do both (extends must be 1st)


//class Bar implements Foo {}        // No! Can’t implement a class
//interface Fee implements Baz {}        // No! An interface can’t implement an interface
//interface Zee implements Foo {}        // No! An interface can’t implement a class
//class Too extends Foo,Button {}        // No! A class can’t extend multiple classes

