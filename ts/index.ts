const world = 'test';

export function hello(word: string = world): string {
  return `Hello ${world}! `;
}