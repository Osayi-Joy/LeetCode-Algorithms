package algorithms;

public class FirstBadVersion  extends VersionControl{
    /* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */
//TODO 278. First Bad Version

        public int firstBadVersion(int n) {
            int low = 1;
            int high = n;
            int mid;
            int result = n;
            while(low < high){
                mid = low + (high - low)/2;
                if(isBadVersion(mid)){
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            if(isBadVersion(low)){
                result = low;
            } else {
                result = low + 1;
            }
            return result;
        }


}

