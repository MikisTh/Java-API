static void shellSort(int[] array)
{
    /*
     * for-loop setup:
     *      1. set the gapSize to the length of the arrray / 2
     *      2. run the loop as long as gapSize > 0
     */
    for (int gapSize = array.length / 2; gapSize > 0; gapSize /= 2)
    {
        for (int currentIndex = gapSize; currentIndex < array.length; currentIndex++)
        {
            // save the currentIndex
            int currentIndexCopy = currentIndex;
            // save the value of the currentIndex
            int item = array[currentIndex];

            while (currentIndexCopy >= gapSize && array[currentIndexCopy - gapSize] > item)
            {
                array[currentIndexCopy] = array[currentIndexCopy - gapSize];
                currentIndexCopy -= gapSize;
            }

            array[currentIndexCopy] = item;
        }
    }
}
