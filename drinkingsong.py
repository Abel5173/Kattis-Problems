n = int(input())
w = input()
while (n > 0):
    if n == 2:
        print('2 bottles of {} on the wall, 2 bottles of {}.\nTake one down, pass it around, 1 bottle of {} on the wall.'.format(w, w, w))
    elif n == 1:
        print('1 bottle of {} on the wall, 1 bottle of {}.\n Take it down, pass it around, no more bottles of {}.'.format(w, w, w))
    else:
        print('{} bottles of {} on the wall, {} bottles of {}.\nTake one down, pass it around, {} bottles of {} on the wall.'.format(
            n, w, n, w, n-1, w))
    n -= 1
