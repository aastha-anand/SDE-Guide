# SDE-Guide

## Array Operation:
| Operation             | Java             |         Time |          Space |
| --------------------- | ---------------- | -----------: | -------------: |
| Create array          | `new int[n]`     |     **O(n)** |           O(n) |
| Access element        | `arr[i]`         |     **O(1)** |           O(1) |
| Update element        | `arr[i] = x`     |     **O(1)** |           O(1) |
| Traverse              | `for(...)`       |     **O(n)** |           O(1) |
| Search unsorted       | Linear search    |     **O(n)** |           O(1) |
| Search sorted         | Binary search    | **O(log n)** | O(1) iterative |
| Insert at end         | `arr[n] = x`*    |     **O(1)** |           O(1) |
| Insert at beginning   | Shift elements   |     **O(n)** |           O(1) |
| Insert in middle      | Shift elements   |     **O(n)** |           O(1) |
| Delete from end       | Logical deletion |     **O(1)** |           O(1) |
| Delete from beginning | Shift elements   |     **O(n)** |           O(1) |
| Delete from middle    | Shift elements   |     **O(n)** |           O(1) |

## java.util.Arrays — Most Important Methods
| Method                                             | Purpose                            | Typical Complexity |
| -------------------------------------------------- | ---------------------------------- | -----------------: |
| `Arrays.sort(array)`                               | Sort entire array                  |         O(n log n) |
| `Arrays.sort(array, from, to)`                     | Sort range                         |         O(k log k) |
| `Arrays.sort(array, comparator)`                   | Sort object array using comparator |         O(n log n) |
| `Arrays.sort(array, from, to, comparator)`         | Sort object range                  |         O(k log k) |
| `Arrays.parallelSort(array)`                       | Parallel sort                      | O(n log n) typical |
| `Arrays.parallelSort(array, from, to)`             | Parallel sort range                | O(k log k) typical |
| `Arrays.parallelSort(array, comparator)`           | Parallel object sort               | O(n log n) typical |
| `Arrays.parallelSort(array, from, to, comparator)` | Parallel range sort                | O(k log k) typical |

| Method                                                      | Purpose                 | Complexity |
| ----------------------------------------------------------- | ----------------------- | ---------: |
| `Arrays.binarySearch(array, key)`                           | Search sorted array     |   O(log n) |
| `Arrays.binarySearch(array, from, to, key)`                 | Search sorted range     |   O(log n) |
| `Arrays.binarySearch(T[] array, T key)`                     | Object array search     |   O(log n) |
| `Arrays.binarySearch(T[] array, from, to, key)`             | Object range search     |   O(log n) |
| `Arrays.binarySearch(T[] array, key, comparator)`           | Comparator search       |   O(log n) |
| `Arrays.binarySearch(T[] array, from, to, key, comparator)` | Comparator range search |   O(log n) |

| Method                                | Purpose           | Complexity |
| ------------------------------------- | ----------------- | ---------: |
| `Arrays.fill(array, value)`           | Fill entire array |       O(n) |
| `Arrays.fill(array, from, to, value)` | Fill range        |       O(k) |

| Method                            | Purpose           | Complexity |
| --------------------------------- | ----------------- | ---------: |
| `Arrays.copyOf(array, newLength)` | Copy/resize array |       O(k) |
| `Arrays.copyOf(T[], newLength)`   | Copy object array |       O(k) |

| Method                                | Purpose                 | Complexity |
| ------------------------------------- | ----------------------- | ---------: |
| `Arrays.copyOfRange(array, from, to)` | Copy part of array      |       O(k) |
| `Arrays.copyOfRange(T[], from, to)`   | Object array range copy |       O(k) |

| Method                                        |        Complexity |
| --------------------------------------------- | ----------------: |
| `Arrays.equals(a, b)`                         |              O(n) |
| `Arrays.equals(a, fromA, toA, b, fromB, toB)` |              O(k) |
| `Arrays.deepEquals(a, b)`                     | O(total elements) |

| Method                                        |        Complexity |
| --------------------------------------------- | ----------------: |
| `Arrays.equals(a, b)`                         |              O(n) |
| `Arrays.equals(a, fromA, toA, b, fromB, toB)` |              O(k) |
| `Arrays.deepEquals(a, b)`                     | O(total elements) |

Arrays.equals(a, b);

Arrays.compare(a, b);

Arrays.mismatch(a, b);

Arrays.toString(arr);

Arrays.deepToString(matrix);

Arrays.hashCode(arr);

Arrays.setAll(arr, i -> ...);

Arrays.parallelPrefix(arr, (a, b) -> ...);

Arrays.stream(arr);

1D Array
   │
   ├── equals()
   ├── toString()
   └── hashCode()
   
Nested / 2D Array
   │
   ├── deepEquals()
   ├── deepToString()
   └── deepHashCode()
