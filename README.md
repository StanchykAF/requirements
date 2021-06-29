## Exceptions

Current theme of our tasks is Exceptions.

First task is to go to Objects class and fill four methods:  </br>
1) requireNonNull(Object): should throw new NullPointerException if object is null </br>
2) requireNonNull(Object, String) should throw new NullPointerException with message if object is null </br>
3) toString(Object) should return object.toString(); or "null" if Object is null </br>
4) equals(Object, Object) should return if object equals or not and null if Object is null </br> 

Second task is to go to Preconditions class and fill four methods: </br>
1) checkArgument(boolean) if boolean is false should throw new IllegalArgumentException </br>
2) checkArgument(boolean, String) if boolean is false should throw new IllegalArgumentException with message </br>
3) checkNotNull(Object) should throw new IllegalArgumentException if object is null </br>
4) checkElementIndex(int, int) if index out of bounds throw new IndexOutOfBoundsException </br>
