def printMove(fr, to):
    print("Move from " + str(fr) + " to " + str(to))

def tower(n, fr, to, spare):
    if n == 1:
        printMove(fr, to)
    else:
        tower(n-1, fr, spare, to)
        tower(1, fr, to, spare)
        tower(n-1, spare, to, fr)

tower(3, 1, 3, 2)