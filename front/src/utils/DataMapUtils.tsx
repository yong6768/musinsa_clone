

/**
 * magazine 타입을 한글로 변경
 * ex) news -> 뉴스
 */
const magazineTypeDisplayMap = new Map([
  ['news', '뉴스'],
  ['recruit', '구인'],
  ['magazine', '매거진'],
  ['tv', 'TV'],
  ['lookbook', '룩북'],
  ['runway', '런웨이'],
  ['street-snap', '스트립 스냅'],
  ['brand-snap', '브랜드 스냅'],
])
export function getDisplayFromMagazineType(key: string): string|undefined {
  return magazineTypeDisplayMap.get(key)
}