## Checks and Utils

First task is to go to [`Utils`](src/main/java/com/epam/rd/autotasks/exceptions/Utils.java) class and implement four methods: 
1. `requireNonNull(Object)` should throw new NullPointerException if object is null1
1. `requireNonNull(Object, String)` should throw new NullPointerException with message if object is null
1. `toString(Object)` should return object.toString(); or "null" if Object is null
1. `equals(Object, Object)` should return if object equals or not and null if Object is null

Second task is to go to [`Checks`](src/main/java/com/epam/rd/autotasks/exceptions/Checks.java) class and fill four methods: 
1. `checkArgument(boolean)` if boolean is false should throw new IllegalArgumentException 
1. `checkArgument(boolean, String)` if boolean is false should throw new IllegalArgumentException with message 
1. `checkElementIndex(int, int)` if index out of bounds throw new IndexOutOfBoundsException
