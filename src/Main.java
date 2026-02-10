import module java.base;

public class Main {

    static void main() {

        // A Set stores UNIQUE elements — no duplicates


        Set<String> names = new HashSet<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Alice");  // duplicate — ignored!

        System.out.println(names);        // [Alice, Bob]
        System.out.println(names.size()); // 2, not 3!

        // TODO #1: Create a HashSet of favorite foods
        // Add at least 4 foods, including one duplicate
        // Print the set and its size

        Set<String> foods = new HashSet<>();

        // Add your foods here:
        foods.add("Brocoli");
        foods.add("Chicken");
        foods.add("Cow Liver");
        foods.add("Chips");
        foods.add("Chips");
        System.out.println(foods);
        System.out.println(foods.size());


        // Print the set and its size:

        // Map<KeyType, ValueType>
        Map<String, String> contacts = new HashMap<>();

        contacts.put("Alice", "555-0101");
        contacts.put("Bob",   "555-0202");

// Get a value by its key
        String number = contacts.get("Alice");  // "555-0101"

// Duplicate key REPLACES the old value!
        contacts.put("Alice", "555-9999");
        System.out.println(contacts.get("Alice"));  // "555-9999"

        // TODO #4: Create a Map of student names → ages
        Map<String, Integer> ages = new HashMap<>();
        ages.put("Franklin", 16);
        ages.put("Matriarch", 18);
        ages.put("Felix", 14);

        System.out.println(ages);


// Add at least 3 students with their ages:


// Retrieve and print one student's age:





    }

}
