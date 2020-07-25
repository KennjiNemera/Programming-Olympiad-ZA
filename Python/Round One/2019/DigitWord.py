words = ['ONE', 'TWO', 'THREE', 'FOUR', 'FIVE', 'SIX', 'SEVEN', 'EIGHT', 'NINE']

def contains(S, W):
    pos = 0
    for c in W:
        if (c == S[pos]):
            pos += 1
            if (pos == len(S)):
                return True
    return False
        
# main input 
W = input('Enter the word: ').upper()
for S in words:
    if(contains(S, W)):
        print(S)
        break
    else:
        print('NONE')