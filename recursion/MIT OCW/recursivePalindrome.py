def checkPali(s):
    if len(s) in (0, 1):
        return True
    else:
        # cool way:
        # return s[0] == s[-1] and checkPali(s[1:-1])

        # easy way:
        if s[0] == s[-1]:
            return checkPali(s[1:-1])
        else:
            return False

print(checkPali("AWAY"))
print(checkPali("AWA AWA"))