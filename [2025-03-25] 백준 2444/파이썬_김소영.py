n = int(input())

# 위쪽 삼각형
for i in range(1, n + 1):
    # 공백 출력
    print(" " * (n - i), end="")
    # 별 출력
    print("*" * (2 * i - 1))

# 아래쪽 역삼각형
for i in range(n - 1, 0, -1):
    # 공백 출력
    print(" " * (n - i), end="")
    # 별 출력
    print("*" * (2 * i - 1))
