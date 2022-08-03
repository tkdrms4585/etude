package dataStructure;

public interface List<E> {
    /* 요소 추가
     * 
     * @param value 추가 요소
     * @return 추가 성공 여부
     */
    boolean add(E value);

    /* 특정 위치에 요소 추가
     * 
     * @param index 위치 변수
     * @param value 추가 요소
     */
    void add(int index, E value);

    /* 특정 요소 삭제
     * 동일 요소 여럿 존재 시 가장 처음 발견된 요소 삭제
     * 
     * @param Value 삭제할 요소
     * @return 삭제 성공 여부
     */
    boolean remove(Object value);

    /* 특정 위치 요소 삭제
     * 
     * @param index 위치 변수
     * @return 삭제된 요소
     */
    E remove(int index);

    /* 특정 위치 요소 반환
     * 
     * @param index 위치 변수
     * @return 요소 반환
     */
    E get(int index);

    /* 특정 요소가 몇 번째인지 반환
     * 
     * @param 찾을 요소
     * @return 위치 반환, 일치하는 요소 없을 경우 -1 반환
     */
    int indexOf(Object value);

    /* 특정 요소가 있는지 여부
     * 
     * @param value 찾을 요소
     * @return 요소 존재 여부
     */
    boolean contains(Object value);

    /* 특정 위치의 요소를 새 요소로 대체
     * 
     * @param index 위치 변수
     * @param value 대체할 요소
     */
    void set(int index, E value);

    /* 요소 개수 반환
     * 
     * @return 요소 개수
     */
    int size();

    /* 요소가 비었는지 여부 반환
     * 
     * @return 비었는지 여부
     */
    boolean isEmpty();

    /*
     * 리스트 요소 모두 삭제
     * 
     */
    void clear();
}