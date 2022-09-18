n = int(input())
for i in range(n):
    a = []
    c = True
    l = filter(lambda z: z != '.', list(input()))
    for x in l:
        if not c:
            break
        if x == '$' or x == '|' or x == '*':
            a.append(x)
        else:
            if len(a) == 0:
                print('NO')
                c = False
                break
            b = a.pop()
            if x == 't' and b != '|':
                c = False
                print('NO')
                break
            if x == 'b' and b != '$':
                c = False
                print('NO')
                break
            if x == 'j' and b != '*':
                c = False
                print('NO')
                break
    if len(a) != 0 and c:
        print('NO')
        c = False
    if c:
        print('YES')
