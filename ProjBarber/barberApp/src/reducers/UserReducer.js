import { act } from "react-test-renderer";

export const initialState = {
    avatar: '',
    favorites: [],
    appointments: []

};

//informações iniciais do usuários que eu preciso ter q
//qq tela que eu tiver acessando

export const useReducer = (state, action) => {
//grade de ações que eu vou poder fazer c as info do user
    switch(action.type) {
        case 'setAvatar':
            return { ...state, avatar: action.payload.avatar };
//o retorn vai copiar o conteúdo que tiver e alterar o avatar
        break;
        default:
            return state;
    }
}
