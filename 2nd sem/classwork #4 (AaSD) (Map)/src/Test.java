public class Test {
    public static void main(String[] args) {
        MyMap<String, Integer> map = new MyMap<>();
        MyMap<String, Integer> map1 = new MyMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map1.put("three", 3);
        map1.put("four", 4);
        map1.put("five", 5);
        System.out.println(map.toString());
        System.out.println(map.size());
        System.out.println(map.containsKey("two"));
        map.remove("three");
        map.putAll(map1);
        System.out.println(map.toString());
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.entrySet());
        map.replace("two", 2,10);
        System.out.println(map.toString());
    }
}
