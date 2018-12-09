
class Solution:
    def canReorderDoubled(self, A):
        """
        :type A: List[int]
        :rtype: bool
        """
        d = {}
        A = sorted(A)[::-1]
        for i in A:
            if i * 2 in d:
                if len(d[i*2]) > 0:
                    d[i*2].pop()
                elif i in d:
                    d[i].append(i)
                else:
                    d[i] = [i]
            elif i / 2 in d:
                if len(d[i/2]) > 0:
                    d[i/2].pop()   
                elif i in d:
                    d[i].append(i)
                else:
                    d[i] = [i]
            elif i in d:
                d[i].append(i)
            else:
                d[i] = [i]
            
        if len(list(filter(lambda x: len(x) > 0, d.values()))) == 0:
            return True
    
        
        return False

