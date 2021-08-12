def print1toN(num): # for num=5;  1 2 3 4 5 (expected)
    if num==0:
        return
    print1toN(num-1) # So by above this is expected to print 1 2 3 4
    print(num) # then at the end print 5 (since line 2 prints till 4)

def printNto1(num): # Let's assume (Holy God) that it prints 5 4 3 2 1 for num=5
    if num==0:
        return
    print(num) # so we will print 5 here and beleive that the call below prints the rest
    printNto1(num-1) # hoping to print 4 3 2 1

def factorial(num):
    if num==0:
        return 1
    small_ans = factorial(num-1) # Recursion Work (Tera)
    ans = small_ans*num # My Work (Mera)
    return ans

# printNto1(5)
print(factorial(5))


"""
Concept:
Decide: Pehle aap (Recursion to work first then I will)
ya Pehle m        (I'll work first then call recursion)
"""