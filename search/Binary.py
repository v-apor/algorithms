# NOT THE MOST EFFICIENT | COS I'VE BEEN COPYING THE ENTIRE LIST

def binarySearch(arr, ele):
    if len(arr) <= 1:
        return arr[0] == ele
    else:
        half = len(arr)//2
        if arr[half] < ele:
            return binarySearch(arr[half:], ele)
        elif arr[half] > ele:
            return binarySearch(arr[:half], ele)
        else:
            return True

arr = [1, 4, 6, 46, 347]
print(binarySearch(arr, 46))
print(binarySearch(arr, 40))
