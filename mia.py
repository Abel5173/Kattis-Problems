while True:
    a, b, c, d = map(int, input().split())
    if a == b == c == d == 0:
        break
    if b > a:
        a, b = b, a
    if d > c:
        c, d = d, c
    x = a*10 + b
    y = c*10 + d
    if x == y:
        print('Tie.')
    elif x == 21:
        print('Player 1 wins.')
    elif y == 21:
        print('Player 2 wins.')
    elif d == c and a != b:
        print('Player 2 wins.')
    elif d != c and a == b:
        print('Player 1 wins.')
    elif x > y:
        print('Player 1 wins.')
    elif x < y:
        print('Player 2 wins.')
