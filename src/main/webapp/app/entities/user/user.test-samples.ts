import { IUser } from './user.model';

export const sampleWithRequiredData: IUser = {
  id: 4371,
  login: 'qyAg@cfXt\\}LZHv\\Bq7',
};

export const sampleWithPartialData: IUser = {
  id: 10325,
  login: '.vSj',
};

export const sampleWithFullData: IUser = {
  id: 2333,
  login: 'I',
};
Object.freeze(sampleWithRequiredData);
Object.freeze(sampleWithPartialData);
Object.freeze(sampleWithFullData);
