n = int(input())

for i in range(n):
    star = 2 * (n - i) - 1         
    print(" " * i + "*" * star)
