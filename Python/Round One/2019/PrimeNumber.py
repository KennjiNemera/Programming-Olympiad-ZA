def isPrime(p):
  if (p < 2):
    return False
  x = 2
  while (x * x <= p):
    if (p % 2 == 0):
      return False
    x += 1
  return True

# get the index from the user
n = int(input('What index would you like to get: \n'))
i = 1
num = 0

# check if the number a prime and hold the index
while (num < n):
  if (isPrime(i)):
    num += 1
  i += 1
print(i - 1)