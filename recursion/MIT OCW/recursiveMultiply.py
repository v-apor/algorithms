# Recursively we can think of it as
# a*b = a + a*(b-1)

def product(a, b):
    if b == 1:
        return a
    else:
        return a + product(a, b-1)

print(product(2, 10))