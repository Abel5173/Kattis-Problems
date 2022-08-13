n = int(input())
for i in range(n):
    x = int(input())
    l = []
    c = 1
    for i in range(x):
        a = input()
        l.append(a)
        if len(l) != 1:
            if l.count(a) == 1:
                c += 1
    print(c)
