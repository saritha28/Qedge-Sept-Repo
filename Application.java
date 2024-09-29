class Main {

// create a method
  public static int square(int num) {

    // return statement
    return num * num;
  }


#feature201 changes by Developer saritha for the module paymentgateway oct2023

public class StrategyFactory implements InitializingBean {
    @Autowired
    private List<Strategy> strategyList;
    private Map<String, Strategy> strategyMap;
    @Override
    public void afterPropertiesSet() {
        if (CollectionUtils.isNotEmpty(strategyList)) {
            int size = (int) Math.ceil(strategyList.size() * 4.0 / 3);
            Map<String, Strategy> map = new ConcurrentHashMap<>(size);
            for (Strategy strategy : strategyList) {
                map.put(strategy.getType(), strategy);
            }
            strategyMap = Collections.unmodifiableMap(map);
        }
    }
#end of feature201 code

  public static void main(String[] args) {
    int result;

    // call the method
    // store returned value to result
    result = square(10);

    System.out.println("Squared value of 10 is: " + result);
  }
}