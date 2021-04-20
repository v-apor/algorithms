def solveTH(nPeg, source, destination, auxilary):
    if nPeg == 1:
        print(f"Move disk from peg #{source} to peg #{destination}")
    else:
        # Moving nPeg-1 disk from source to aux using destination as intermediate
        solveTH(nPeg-1, source, auxilary, destination)

        # Moving remaining disk from source to destination
        print(f"Move disk from peg #{source} to peg #{destination}")

        # Moving disks from auxilary to destination
        solveTH(nPeg-1, auxilary, destination, source)

solveTH(3, 1, 3, 2)