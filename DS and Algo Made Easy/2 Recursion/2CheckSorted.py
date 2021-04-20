# To check if array is sorted or not
# Time O(n) | Aux space O(n)
# Useless to solve using recursion since using iteration we can solve in Time O(n) and aux space O(1)

def isSorted(nElements, arr):
    if(nElements==1):
        return True
    else:
        return False if(arr[nElements-1] < arr[nElements-2]) else isSorted(nElements-1, arr)


arr = [int(num) for num in input().split()]
print("Sorted" if isSorted(len(arr), arr) else "Not Sorted")