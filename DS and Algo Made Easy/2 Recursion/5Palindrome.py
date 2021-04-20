# Check if input is plaindrome

def isPalindrome(inp):
    # print(inp)
    if(len(inp)<=1):
        return True
    else:
        return False if(inp[0] != inp[-1]) else isPalindrome([num for num in inp[1:-1]])

inp = [ch for ch in input()]
print("Palindrome" if isPalindrome(inp) else "Not Palindrome")