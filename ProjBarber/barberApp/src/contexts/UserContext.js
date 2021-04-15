import React, { createContext, useReducer } from 'react';
import { initalState, initialState, UserReducer } from '../reducers/UserReducer';

export const UserContext = createContext();

export default ({children}) => {
    const [state, dispatch] = useReducer(useReducer, initialState); 

    return (
        <UserContext.Provider value={{state, dispatch}}>
            {children}
        </UserContext.Provider>
    );
}