# a * b = a + a + a + ... (b times)

def product(a, b): 
    result = 0
    while b > 0:
        result += a
        b -= 1
    return result

print(product(2, 10))