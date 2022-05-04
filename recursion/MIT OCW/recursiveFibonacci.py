def fibo(n):
    if n in (0, 1):
        return 1
    else:
        return fibo(n-1) + fibo(n-2)

print(fibo(1))
print(fibo(2))
print(fibo(3))
print(fibo(4))