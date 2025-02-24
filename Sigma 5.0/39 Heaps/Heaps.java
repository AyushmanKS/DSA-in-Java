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

                child = parent;
                parent = (child-1) / 2;
            }
        }

        public int remove() {
            int data = arr.get(0);

            // swap first and last
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size()-1));
            arr.set(arr.size()-1, temp);

            // delete last
            arr.remove(arr.size()-1);

            // heapify
            heapify(0);

            return data;
        }

        private void heapify(int i) {
            int left = 2*i + 1;
            int right = 2*i + 2;
            int min = i;

            if(left < arr.size() && arr.get(min) > arr.get(left)) {
                min = left;
            }

            if(right < arr.size() && arr.get(min) > arr.get(right)) {
                min = right;
            }

            if(min != i) {
                // swap
                int temp = arr.get(i);
                arr.set(i, arr.get(min));
                arr.set(min, temp);

                heapify(min);
            }
        }

        public boolean isEmpty() {
            return arr.size() == 0;
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
