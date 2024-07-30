import { IAuthority, NewAuthority } from './authority.model';

export const sampleWithRequiredData: IAuthority = {
  name: '647f6b0e-6f6e-4a67-8c5a-5222ecf97150',
};

export const sampleWithPartialData: IAuthority = {
  name: 'db1ba5de-d0d9-4217-9969-9518f1d85e77',
};

export const sampleWithFullData: IAuthority = {
  name: '966df433-0a23-4d7b-aaf3-26f55dbc32c9',
};

export const sampleWithNewData: NewAuthority = {
  name: null,
};

Object.freeze(sampleWithNewData);
Object.freeze(sampleWithRequiredData);
Object.freeze(sampleWithPartialData);
Object.freeze(sampleWithFullData);
