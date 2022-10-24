from functools import reduce

try:
    while True:
        n = int(input())
        x = sum(set(reduce(list.__add__,
                           ([i, n//i] for i in range(1, int(n**0.5) + 1) if n % i == 0)))) - n
        if x-n == 0:
            print(f'{n} perfect')
        elif (abs(x - n) < 3):
            print(f'{n} almost perfect')
        else:
            print(f'{n} not perfect')
except:
    pass
