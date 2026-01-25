import java.util.*;

class InsertDeleteGetRandom {
    private Map<Integer, Integer> valueIndexMap; // Maps value to its index in the list
    private List<Integer> values; // Stores the elements of the set
    private Random random; // Random object for generating random numbers

    public InsertDeleteGetRandom() {
        valueIndexMap = new HashMap<>();
        values = new ArrayList<>();
        random = new Random();
    }

    // Inserts a value if it's not already present in the set
    public boolean insert(int val) {
        if (valueIndexMap.containsKey(val)) {
            return false; // Value already exists
        }
        valueIndexMap.put(val, values.size());
        values.add(val);
        return true;
    }

    // Removes a value if it exists in the set
    public boolean remove(int val) {
        if (!valueIndexMap.containsKey(val)) {
            return false; // Value doesn't exist
        }
        // Swap the value with the last element in the list
        int lastElement = values.get(values.size() - 1);
        int indexToRemove = valueIndexMap.get(val);

        values.set(indexToRemove, lastElement);
        valueIndexMap.put(lastElement, indexToRemove);

        // Remove the last element
        values.remove(values.size() - 1);
        valueIndexMap.remove(val);
        return true;
    }

    // Returns a random value from the set
    public int getRandom() {
        int randomIndex = random.nextInt(values.size());
        return values.get(randomIndex);
    }

    public static void main(String[] args) {
        InsertDeleteGetRandom randomizedSet = new InsertDeleteGetRandom();

        // Example operations
        System.out.println(randomizedSet.insert(1)); // Inserts 1 to the set. Returns true.
        System.out.println(randomizedSet.remove(2)); // Returns false as 2 does not exist in the set.
        System.out.println(randomizedSet.insert(2)); // Inserts 2 to the set. Returns true.
        System.out.println(randomizedSet.getRandom()); // Returns either 1 or 2 randomly.
        System.out.println(randomizedSet.remove(1)); // Removes 1 from the set. Returns true.
        System.out.println(randomizedSet.insert(2)); // 2 already exists. Returns false.
        System.out.println(randomizedSet.getRandom()); // Returns 2 (since it's the only element).
    }
}
