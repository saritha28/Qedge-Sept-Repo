class Main {

// create a method
  public static int square(int num) {

    // return statement
    return num * num;
  }

#feature202 changes on reports module by Ethan in oct2023
public static final Map<String, Class> CLASS_MAP;
static {
    Map<String, Class> classMap = new HashMap<>(16);
    classMap.put("VARCHAR", java.lang.String.class);
    ...
    CLASS_MAP = Collections.unmodifiableMap(classMap);
}

#end of code changes

  public static void main(String[] args) {
    int result;

    // call the method
    // store returned value to result
    result = square(10);

    System.out.println("Squared value of 10 is: " + result);
  }
}