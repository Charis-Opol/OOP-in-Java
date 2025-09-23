def binary_search(array, key):
    right = len(array) - 1
    left = 0

    while left <= right:
        mid = (left + right)//2
        
        if array[mid] == key:
            return mid
        elif array[mid] < key:
            left = mid + 1
        elif array[mid] > key:
            right = mid - 1
    return -1

arraylist = [2, 4, 7, 8, 12, 15, 24]
print(arraylist)
input = int(input("Enter the value you want to search for: "))
answer = binary_search(arraylist, input)
if answer != -1:
    print(f"{input} was found at index {answer}")
else:
    print("Not found")  