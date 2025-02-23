import java.util.ArrayList;

public class Heaps {
    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        // Insert a new element into the heap
        public void add(int data) {
            arr.add(data);
            int child = arr.size() - 1; 
            int parent = (child - 1) / 2; 

            // Heapify up (Min-Heap property)
            while (child > 0 && arr.get(child) < arr.get(parent)) {
                int temp = arr.get(child);
                arr.set(child, arr.get(parent));
                arr.set(parent, temp);

                // Update indices
                child = parent;
                parent = (child - 1) / 2;
            }
        }

        // Print the heap as a list
        public void printHeap() {
            System.out.println(arr);
        }
    }

    public static void main(String args[]) {
        Heap heap = new Heap();
        
        heap.add(10);
        heap.add(5);
        heap.add(20);
        heap.add(2);
        heap.add(8);
        heap.add(15);
        heap.add(25);

        System.out.print("Heap structure: ");
        heap.printHeap();
    }
}
