try:
    while True:
        l = [int(i) for i in input().split()]
        n = l[0]
        s = set()
        b = True
        for i in range(2, n):
            if abs(l[i] - l[i - 1]) in s or abs(l[i] - l[i - 1]) > n - 1:
                print('Not jolly')
                b = False
                break
            else:
                s.add(abs(l[i] - l[i - 1]))
        if b:
            print('Jolly')
except:
    pass
