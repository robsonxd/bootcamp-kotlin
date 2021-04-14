import React, { createContext, useReducer } from 'react';
import { initalState, UserReducer } from '../reducers/UserReducer';

export const UserContext = createContext();

export default ({children}) => {

    return (
        <UserContext.Provider>
            {children}
        </UserContext.Provider>
    );
}