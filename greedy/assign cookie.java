class Solution {
    public int findMaximumCookieStudents(int[] Student, int[] Cookie) {
        //your code goes here
        Arrays.sort(Student);
        Arrays.sort(Cookie);
        int l = 0;
        int r = 0;
        int n = Student.length;
        int m = Cookie.length;

        while(l<n && r<m){
            if(Student[l]<=Cookie[r]){
                l++;
            }
            r++;
        }
        return l;
    }
}