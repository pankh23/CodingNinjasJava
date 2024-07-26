import java.util.*;
public class countSmall {
        public static int[] countS(int n, int m, int []a, int []b) {
            // Write your code here.
            Arrays.sort(b);
            int[] result = new int[a.length];
    
            for (int i = 0; i < a.length; i++) {
                int left = 0, right = b.length - 1;
                int index = -1;
                while (left <= right) {
                    int mid = left + (right - left) / 2;
                    if (b[mid] <= a[i]) {
                        index = mid;
                        left = mid + 1;
                    } else {
                        right = mid - 1;
                    }
                }
                result[i] = index + 1;
            }
    
            return result;
    
        }
    }

