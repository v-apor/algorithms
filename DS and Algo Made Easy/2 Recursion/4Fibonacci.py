def getFibo(num):
    if num in [1,2]:
        return num-1
    else:
        return getFibo(num-1) + getFibo(num-2)

print(getFibo(int(input())))